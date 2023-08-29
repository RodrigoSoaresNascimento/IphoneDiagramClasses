package interfaces;

import entities.Contact;

public interface Telephone {

    String toConnect (Contact contact);

    String attendant (Contact contact);

    String voiceEmail (Contact contact);

    void rejectConnection (String phoneNumber);

    String endCall ();

}
