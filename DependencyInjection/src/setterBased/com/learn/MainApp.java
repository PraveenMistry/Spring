package setterBased.com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Praveen on 10/03/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te= (TextEditor) context.getBean("setterTextEditorBean");
        te.spellCheck();
    }
}
