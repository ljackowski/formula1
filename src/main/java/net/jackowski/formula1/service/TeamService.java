package net.jackowski.formula1.service;

import net.jackowski.formula1.model.Team;
import net.jackowski.formula1.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@SuppressWarnings("SpellCheckingInspection")
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Map<String, Integer> getAllTeams(int position) {
        List<Team> teams = (List<Team>) teamRepository.findAll(); //pobieram dane z tabeli teams
        Map<String, Integer> resoult = new HashMap<>(); //tworze pustą mapę

        //tworzę listę z nazwami teamów tak aby się nie powtarzały, a następnie z listy teams, filtruje ja tak aby zwrócony została dana drużyna oraz jej pozycja oraz zliczam te wystąpienia,
        // następnie wkładam te wartości jako values do mapy,
        // oraz usuwam drużynę, która miała 0 kierowców na danej pozycji
        //pozycja danej drużyny jest pobierana z pathvariable w TeamControllerze, po wpisaniu odpowiedniego endpointu
        for (String teamName : teams.stream().map(Team::getTeamName).distinct().collect(Collectors.toList())) {
            resoult.put(teamName, (int) teams.stream().filter(team -> team.getTeamName().equals(teamName) & team.getPlace() == position).count());
            resoult.remove(teamName,0);
        }

        //zwrócenie nowej posortowanej, po wartościach mapy, ze starej
        return resoult.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValues) -> oldValue, LinkedHashMap::new));
    }

}
