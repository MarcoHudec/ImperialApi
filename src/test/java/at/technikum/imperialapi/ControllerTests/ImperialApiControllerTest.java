package at.technikum.imperialapi.ControllerTests;

import at.technikum.imperialapi.Controller.ImperialApiController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperialApiControllerTest {

    private ImperialApiController imperialApiController = new ImperialApiController();

    @Test
    public void InchToCentiTest()
    {
        //Arrange
        double test = 5;


        //Act
        double result = imperialApiController.InchToCenti(test);

        //Assert
        assertEquals(12.7, result);
    }

}
