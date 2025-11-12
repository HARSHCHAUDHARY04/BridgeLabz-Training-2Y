import java.util.*;
public class OnlineExamManagement {
    static class Question { String id; Question(String id){ this.id = id; } public String toString(){ return id; } }
    static class Student { String id; Student(String id){ this.id = id; } public String toString(){ return id; } }
    public static void main(String[] args){
        List<Question> questions = new ArrayList<>(Arrays.asList(new Question("Q1"), new Question("Q2"), new Question("Q3")));
        Collections.shuffle(questions);
        Set<String> studentIds = new HashSet<>();
        studentIds.add("S1"); studentIds.add("S2");
        studentIds.add("S1"); // duplicate ignored
        Queue<Student> waiting = new LinkedList<>();
        waiting.add(new Student("S1"));
        waiting.add(new Student("S2"));
        Stack<Question> navStack = new Stack<>();
        while(!waiting.isEmpty()){
            Student s = waiting.poll();
            System.out.println("Serving " + s);
            navStack.clear();
            for(Question q : questions){
                System.out.println("Question for " + s + " -> " + q);
                navStack.push(q);
            }
            System.out.println("Student navigates back to -> " + navStack.pop());
        }
    }
}

