package se331.lab.rest.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    Long id;
    String category;
    String title;
    String description;
    String location;
    String data;
    String time;
    Boolean petAllowed;
    EventOrganizerDTO organizer;
    List<EventParticipantDTO> participants;
    List<String> images;
}
