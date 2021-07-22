package pojo;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author YANG
 * @create 2021-07-11 14:44
 */
public class Dom4jTest {

    @Test
    public void test1() throws Exception {
        // 创建一个SAXReader输入流，去读取xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("src/books.xml");
        System.out.println(document);
    }

    /*
    读取books.xml文件生成Book类
     */
    @Test
    public void test2() throws Exception{
        // 1. 读取books.xml文件
        SAXReader saxReader = new SAXReader();
        // 在Junit测试中，相对路径是从模块名开始算的
        Document read = saxReader.read("src/books.xml");
        // 2. 通过Document对象获取根目录
        Element rootElement = read.getRootElement();
        // 3. 通过根目录获取book标签对象
        /*
        element() 和 element() 都是通过标签名查找子元素
         */
        List<Element> books = rootElement.elements("book");
        // 4. 遍历，处理每个book标签转换为Book类
        for (Element book : books){
            // asXML() 把标签对象。转换为标签字符串
//            System.out.println(book.asXML());

            Element nameElement = book.element("name");
            // getText() 可以获取标签中的文本内容
            String nameText = nameElement.getText();
            // 也可以用elementText() 直接获取标签中的文本内容
            String priceText = book.elementText("price");
            String authorText = book.elementText("author");
            /*
            attributeValue() 方法可以获取标签属性
             */
            String snValue = book.attributeValue("sn");

            // 封装到java对象Book中
            Book book1 = new Book(snValue, nameText, BigDecimal.valueOf(Double.parseDouble(priceText)), authorText);
            System.out.println(book1);

        }
    }
}
