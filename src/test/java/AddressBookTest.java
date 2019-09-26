import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    @Test
    void givenEmptyPerson_whenAdd_thenShouldReturnFalse(){
        Person person =new Person(" ", 0, " ",0);
        AddressBook address=new AddressBook();
        Assertions.assertEquals(false,address.add(person));
    }
}
