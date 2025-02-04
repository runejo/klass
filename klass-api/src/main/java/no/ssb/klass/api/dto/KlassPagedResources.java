package no.ssb.klass.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.List;

/**
 * @author Mads Lundemo, SSB.
 *         <p>
 *         This class overrides the XML anotations for content and links,
 *         We do this so we can change tag names and distinguish a list of elements from the elements within the list
 *         <p>
 *         ex.
 *         links
 *         - link
 *         - link
 *         links
 */
@JacksonXmlRootElement(localName = "pagedEntities")
@XmlRootElement(name = "pagedEntities")
public class KlassPagedResources<T> extends PagedResources<T> {

    public KlassPagedResources(PagedResources<T> p) {
        super(p.getContent(), p.getMetadata(), p.getLinks());
    }

    @Override
    @XmlAnyElement
    @XmlElementWrapper
    @JacksonXmlElementWrapper(localName = "contents")
    public Collection<T> getContent() {
        return super.getContent();
    }

    @Override
    @XmlElement(name = "link", namespace = Link.ATOM_NAMESPACE)
    @JacksonXmlElementWrapper(localName = "links")
    @JacksonXmlProperty(localName = "link")
    public List<Link> getLinks() {
        return super.getLinks();
    }
}
