package by.bsuir.publisher.model.response;

import java.time.LocalDateTime;

public record StoryResponseTo(
        Long id,
        Long editorId,
        String title,
        String content,
        LocalDateTime created,
        LocalDateTime modified
) {}
