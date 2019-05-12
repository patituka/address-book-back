package fr.formation.addressbook.utils;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Administrateur
 * @param <T>
 */
public class PageWrapper<T> extends PageImpl<T> {

    private static final long serialVersionUID = -8730562286651559083L;

    /**
     * @param content
     */
    public PageWrapper(List<T> content, Pageable pageable, long total) {
	super(content, pageable, total);
    }

    /**
     * @return
     */
    @Override
    @JsonProperty("data")
    public List<T> getContent() {
	return super.getContent();
    }
}
