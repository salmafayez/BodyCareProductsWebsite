package gov.iti.jets.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_message", catalog = "skincareapp")
public class ContactMessage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contact_id",length = 10)
    private int id;

    @Column(name="contact_name")
    private String contactName;

    @Column(name="contact_message")
    private String contactMessage;

    @Column(name="contact_email")
    private String contactEmail;

    public ContactMessage() {

    }
    public ContactMessage(int id, String contactName, String contactMessage, String contactEmail) {
        this.id = id;
        this.contactName = contactName;
        this.contactMessage = contactMessage;
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    @Override
    public String toString() {
        return "ContactMessage{" +
                "id=" + id +
                ", contactName='" + contactName + '\'' +
                ", contactMessage='" + contactMessage + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}
