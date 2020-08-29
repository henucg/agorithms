package tools.序列化.test01.xml;

import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import tools.序列化.test01.serialize.SerializeInterface;

public class XmlSerialize implements SerializeInterface {

	/**
     * 对所有xml节点的转换都增加CDATA标记
     */
    private boolean cdata = true;

    public XmlSerialize() {
        this(true);
    }

    /**
     * @param cdata 对所有xml节点的转换都增加CDATA标记
     */
    public XmlSerialize(boolean cdata) {
        this.cdata = cdata;
    }
	
    /**
     * 对象序列化成xml
     */
	public <T> String serialize(T t) {
		xs.processAnnotations(t.getClass());
		return xs.toXML(t);
	}

	/**
	 * xml反序列化为对象
	 */
	@SuppressWarnings("unchecked")
	public <T> T deserialize(String data, Class<T> clazz) {
		xs.processAnnotations(clazz);
		xs.ignoreUnknownElements();
		return (T)xs.fromXML(data);
	}
	
	/**
     * 重写XppDriver，使其支持CDATA块
     */
	private XStream xs = new XStream(new XppDriver() {
        @Override
        public HierarchicalStreamWriter createWriter(Writer out) {
            return new PrettyPrintWriter(out) {
                @Override
                @SuppressWarnings("rawtypes")
                public void startNode(String name, Class clazz) {
                    super.startNode(name, clazz);
                }

                @Override
                protected void writeText(QuickWriter writer, String text) {
                    if (cdata) {
                        writer.write("<![CDATA[");
                        writer.write(text);
                        writer.write("]]>");
                    } else {
                        writer.write(text);
                    }
                }
            };
        }
    });
}
