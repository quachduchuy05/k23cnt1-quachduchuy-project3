package k23cnt1.qdh.leson4.k23cnt1.qdh.leson4.entity;

public class info {
    private String name;
    private String username;
    private String email;
    private String website;

    // Constructor
    public info(String name, String username, String email, String website) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.website = website;
    }

    // Getters và setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
