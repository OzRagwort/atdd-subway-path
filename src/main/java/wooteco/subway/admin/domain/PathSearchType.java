package wooteco.subway.admin.domain;

import wooteco.subway.admin.domain.exception.IllegalPathSearchTypeException;

import java.util.Arrays;

public enum PathSearchType {
    DISTANCE("DISTANCE"),
    DURATION("DURATION");

    private final String value;

    PathSearchType(String value) {
        this.value = value;
    }

    public static PathSearchType of(String type) {
        return Arrays.stream(PathSearchType.values())
                .filter(pathSearchType -> pathSearchType.isSameValue(type))
                .findFirst()
                .orElseThrow(IllegalPathSearchTypeException::new);
    }

    public boolean isSameValue(String value) {
        return this.value.equals(value);
    }
}
