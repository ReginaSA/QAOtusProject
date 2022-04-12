import api.IApiService;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StubWireMock {

    @Mock
    private IApiService wireMockServer;


}
