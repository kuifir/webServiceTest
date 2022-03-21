
package bbb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bbb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _People_QNAME = new QName("http://impl.service.moduel.kuifir.cn/", "people");
    private final static QName _Weather_QNAME = new QName("http://impl.service.moduel.kuifir.cn/", "weather");
    private final static QName _PeopleResponse_QNAME = new QName("http://impl.service.moduel.kuifir.cn/", "peopleResponse");
    private final static QName _WeatherResponse_QNAME = new QName("http://impl.service.moduel.kuifir.cn/", "weatherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bbb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WeatherResponse }
     * 
     */
    public WeatherResponse createWeatherResponse() {
        return new WeatherResponse();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link PeopleResponse }
     * 
     */
    public PeopleResponse createPeopleResponse() {
        return new PeopleResponse();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link People }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.moduel.kuifir.cn/", name = "people")
    public JAXBElement<People> createPeople(People value) {
        return new JAXBElement<People>(_People_QNAME, People.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.moduel.kuifir.cn/", name = "weather")
    public JAXBElement<Weather> createWeather(Weather value) {
        return new JAXBElement<Weather>(_Weather_QNAME, Weather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.moduel.kuifir.cn/", name = "peopleResponse")
    public JAXBElement<PeopleResponse> createPeopleResponse(PeopleResponse value) {
        return new JAXBElement<PeopleResponse>(_PeopleResponse_QNAME, PeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.moduel.kuifir.cn/", name = "weatherResponse")
    public JAXBElement<WeatherResponse> createWeatherResponse(WeatherResponse value) {
        return new JAXBElement<WeatherResponse>(_WeatherResponse_QNAME, WeatherResponse.class, null, value);
    }

}
