import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.mprj.diario.oficial.modelo.Modelo;
import br.com.mprj.diario.oficial.service.ModeloServiceImpl;


public class SpringOrmMain {

	public static void main(String[] args) {
		//Create Spring application context
				ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/root-context.xml");
				
				ModeloServiceImpl productService = ctx.getBean(ModeloServiceImpl.class);
			//	productService.exibe(new Modelo(1000,"rodrigo"));
				
					
				ctx.close();

	}
}
