package fr.formation.addressbook.utils;

import org.springframework.data.domain.Slice;
import org.springframework.http.HttpHeaders;

/**
 * @author Administrateur
 */
public class PaginationUtils {

    /**
     * @param slice
     * @return
     */
    public static HttpHeaders generateSliceHttpHeaders(Slice<?> slice) {
	HttpHeaders headers = new HttpHeaders();
	headers.add("X-Has-Next-Page", "" + slice.hasNext());
	return headers;
    }
}
