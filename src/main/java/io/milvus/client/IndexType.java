package io.milvus.client;

import java.util.Arrays;
import java.util.Optional;

/**
 * Represents available index types
 */
public enum IndexType {

    INVALID(0),
    FLAT(1),
    IVFLAT(2),
    IVF_SQ8(3),
    MIX_NSG(4),
    IVF_SQ8_H(5),

    UNKNOWN(-1);

    private final int val;

    IndexType(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static IndexType valueOf(int val) {
        Optional<IndexType> search = Arrays.stream(values())
                                           .filter(indexType -> indexType.val == val)
                                           .findFirst();
        return search.orElse(UNKNOWN);
    }
}