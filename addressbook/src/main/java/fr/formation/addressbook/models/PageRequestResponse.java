package fr.formation.addressbook.models;

import java.util.List;

/**
 * @author Administrateur
 * @param <T>
 */
@SuppressWarnings("javadoc")
public class PageRequestResponse<T> {

    private List<T> content;

    private int currentPage;

    private int totalPages;

    public List<T> getContent() {
	return content;
    }

    public void setContent(List<T> content) {
	this.content = content;
    }

    public int getCurrentPage() {
	return currentPage;
    }

    public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
    }

    public int getTotalPages() {
	return totalPages;
    }

    public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
    }
}
