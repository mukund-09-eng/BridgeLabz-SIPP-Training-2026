class InterviewBot {

    private String botName;
    private String technology;

    // Constructor
    public InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    // Method
    public void conductInterview() {
        System.out.println(botName + " is conducting " + technology + " interview.");
    }

    public static void main(String[] args) {

        InterviewBot b1 = new InterviewBot("Bot Alpha", "Java");
        InterviewBot b2 = new InterviewBot("Bot Beta", "Python");
        InterviewBot b3 = new InterviewBot("Bot Gamma", "Web Development");

        b1.conductInterview();
        b2.conductInterview();
        b3.conductInterview();
    }
}
