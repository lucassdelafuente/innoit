
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseTest {


    @Test
    public void validateTitleTweetsMadrid ()
    {
        Assert.assertTrue(homePage.txtTweetsMadridIsDisplayed(), "El título de la sección de Tweets no se esta mostrando.");
    }

    @Test
    public void validateClickableMadridBtn()
    {
        Assert.assertTrue(homePage.btnDiarioMadridIsClickable(), "El botón DIARIO MADRID no es clickable.");
    }

    @Test
    public void validateDateCalendar()
    {
        Assert.assertEquals(systemDate.dayOfWeek() , homePage.getTxtDayToday(), "El día de la semana no conincide con el valor esperado.");
        Assert.assertEquals(systemDate.getDayOfMonth(), homePage.txtNumToday(), "El número del día de la semana no conincide con el valor esperado.");
        Assert.assertEquals(systemDate.getMonth(), homePage.txtMonthToday(), "El mes no coincide con el valor esperado");
    }


}
