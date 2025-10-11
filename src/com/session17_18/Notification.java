package session17_18;

interface Notification {
    void sendMessage();
}

class FirstDevice implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("Message sent through first device");
    }
}

class SecondDevice implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("Message sent through second device");
    }
}

class TestNotification {
    public static void main(String[] args) {
        Notification n1 = new FirstDevice();
        Notification n2 = new SecondDevice();

        n1.sendMessage();
        n2.sendMessage();
    }
}

