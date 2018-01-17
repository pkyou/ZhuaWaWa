package ServiceTest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pkyou.Sample.Main;
import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;
import com.pkyou.Sample.ServiceImp.ControllerService;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
public class ControllerServiceTest {
	@Autowired
	private ControllerService service;
	private ArrayList<IndoorCheckItemEntity> entities;
	
	@Test
	public void resultTest(){
		entities = service.getIndoorCheckItemEntities();
		Assert.assertNotNull(entities);
		Assert.assertEquals(3, entities.size());
	}
}
