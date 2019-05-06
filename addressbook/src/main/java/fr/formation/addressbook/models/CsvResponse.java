package fr.formation.addressbook.models;

import java.time.LocalDateTime;

/**
 * @author Administrateur
 */
public class CsvResponse {

    long rowNumber;

    LocalDateTime start;

    LocalDateTime end;

    int duration;

    public CsvResponse() {
    }

    public long getRowNumber() {
	return rowNumber;
    }

    public void setRowNumber(long rowNumber) {
	this.rowNumber = rowNumber;
    }

    public LocalDateTime getStart() {
	return start;
    }

    public void setStart(LocalDateTime start) {
	this.start = start;
    }

    public LocalDateTime getEnd() {
	return end;
    }

    public void setEnd(LocalDateTime end) {
	this.end = end;
    }

    public int getDuration() {
	return duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }
}
