package lesson19TreeMapSet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import static java.time.LocalDateTime.now;

public class MissedCalls {
    private final NavigableMap<LocalDateTime, String> missed = new TreeMap<LocalDateTime, String>().descendingMap();
    private static final DateTimeFormatter NOW_DATE_TIME = DateTimeFormatter.ofPattern("HH:mm:ss - dd.MM.yyyy");

    public void addCalls(String phoneNumber) {
        missed.put(now(), phoneNumber);
    }

    public String toString(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder("Список пропущенных вызовов:\n");
        for (Map.Entry<LocalDateTime, String> entry : missed.entrySet()) {
            Contact contact = phoneBook.searchingByNumber(entry.getValue());
            String nameOfPhone = contact != null ? contact.getName() : entry.getValue();
            sb
                    .append(entry.getKey().format(NOW_DATE_TIME))
                    .append(" -> ")
                    .append(nameOfPhone)
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "MissedCalls " +
                "missed=" + missed +
                '}';
    }
}