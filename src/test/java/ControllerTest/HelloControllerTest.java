package ControllerTest;

import java.net.URL;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.pkyou.Sample.Main;
import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = Main.class)
public class HelloControllerTest {

//	@LocalServerPort
	private int port;
	private URL base;
	@Autowired
	private TestRestTemplate template;

	@Before
	public void setUp() throws Exception {
		this.base = new URL("http://192.168.7.11:" + port + "/controller/GetIndoorCheckItemEntities");
	}

	@Test
	public void getIndoorInfo() throws Exception{
		ResponseEntity<Object> entities = 
				template.getForEntity(base.toString(),Object.class);		
		ArrayList<IndoorCheckItemEntity> body = (ArrayList<IndoorCheckItemEntity>)entities.getBody();
		
		Assert.assertNotNull(body);
		Assert.assertEquals(body.size(), 3);
	}
}
