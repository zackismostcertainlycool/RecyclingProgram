public class Group {

    private String name;
    private String meetingTime;
    private String contact;

    public Group(String name, String meetingTime, String contact) {
        this.name = name;
        this.meetingTime = meetingTime;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public String getContact() {
        return contact;
    }
}