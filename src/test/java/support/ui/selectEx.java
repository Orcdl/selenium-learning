package support.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectEx extends Select {

    private final String OPTION_01 = "Option 1";


    /**
     * Constructor. A check is made that the given element is, indeed, a SELECT tag. If it is not,
     * then an UnexpectedTagNameException is thrown.
     *
     * @param element SELECT element to wrap
     * @throws UnexpectedTagNameException when element is not a SELECT
     */
    public selectEx(WebElement element) {
        super(element);
    }

    public void selectOption1(){
        selectByVisibleText(OPTION_01);
    }
}
