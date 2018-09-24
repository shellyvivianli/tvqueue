package tvqueue;

class Greeting {

    private long id;
    private String content;

    Greeting() { }

    Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    long getId() {
        return id;
    }

    String getContent() {
        return content;
    }
}
