package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7;

/*7. Statistics
        Create a file that will contain any text. It can be generated using lorem ipsum library.
        Create statistics of words contained in the text.
        Display the number of occurrences of individual words in the form :
        As above sorted.
        Lorem ipsum, random words libs: https://github.com/mdeanda/lorem

<dependency>
<groupId>com.thedeanda</groupId>
<artifactId>lorem</artifactId>
<version>2.1</version>
</dependency>*/


import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

public class Main {

    public static void main(String[] args) {

        Lorem lorem = LoremIpsum.getInstance();
        lorem.getWords(5,10);

        System.out.println(lorem.getWords(5,10));

    }


}
