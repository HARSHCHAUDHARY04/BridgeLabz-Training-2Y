import java.util.*;
public class GamingTournamentTracker {
    static class Player {
        String id; Player(String id){ this.id = id; }
        public String toString(){ return id; }
        public boolean equals(Object o){ return o instanceof Player && ((Player)o).id.equals(id); }
        public int hashCode(){ return Objects.hash(id); }
    }
    static class Match { String id; Match(String id){ this.id = id; } public String toString(){ return id; } }
    static class Result { Player p; int points; Result(Player p,int points){ this.p=p; this.points=points; } public String toString(){ return p + ":" + points; } }
    static class Score implements Comparable<Score> {
        Player p; int pts;
        Score(Player p,int pts){ this.p=p; this.pts=pts; }
        public int compareTo(Score o){ return Integer.compare(o.pts, this.pts); }
        public String toString(){ return p + ":" + pts; }
    }
    public static void main(String[] args){
        Set<Player> players = new HashSet<>(Arrays.asList(new Player("P1"), new Player("P2"), new Player("P3")));
        Queue<Match> matches = new LinkedList<>(Arrays.asList(new Match("M1"), new Match("M2")));
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();
        for(Match m : matches){
            Player winner = players.iterator().next();
            Result r = new Result(winner, new Random().nextInt(100));
            results.add(r);
            leaderboard.add(new Score(r.p, r.points));
            System.out.println("Processed " + m + " -> " + r);
        }
        System.out.println("Leaderboard:");
        for(Score s : leaderboard) System.out.println(s);
    }
}

