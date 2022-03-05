
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
        Assert.assertEquals(homePage.getTxtDayToday(), systemDate.dayOfWeek(), "El día de la semana no conincide con el valor esperado.");
        Assert.assertEquals(homePage.txtNumToday(), systemDate.getDayOfMonth(), "El número del día de la semana no conincide con el valor esperado.");
        Assert.assertEquals(homePage.txtMonthToday(), systemDate.getMonth(), "El mes no coincide con el valor esperado");
    }


}
