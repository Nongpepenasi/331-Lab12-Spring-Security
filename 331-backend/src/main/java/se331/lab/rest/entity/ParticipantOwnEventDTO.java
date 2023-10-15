package se331.lab.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantOwnEventDTO {
    Long id;
    String category;
    String title;
    String description;
    String location;
    String data;
    String time;
    Boolean petAllowed;
    Organizer organizer;
}
