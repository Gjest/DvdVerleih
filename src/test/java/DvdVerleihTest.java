import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DvdVerleihTest {
    @Test
    public void getRentForTwoDays(){
        DvdVerleih dvdv = new DvdVerleih();
        double expectedRent = 2.0;
        assertThat(expectedRent).isEqualTo(dvdv.getRentForDays(2));
    }

    @Test
    public void getRentForThreeDays(){
        DvdVerleih dvdv = new DvdVerleih();
        double expectedRent = 3.75;
        assertThat(expectedRent).isEqualTo(dvdv.getRentForDays(3));
    }
}
