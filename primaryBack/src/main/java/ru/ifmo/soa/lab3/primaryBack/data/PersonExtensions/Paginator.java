package ru.ifmo.soa.lab3.primaryBack.data.PersonExtensions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Paginator {
    private final Integer pageId;
    private final Integer pageSize;
}
