package io.nagaita.workman.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of createdAt.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getCreatedAt();

    /**
     * Set the value of createdAt.
     * @param createdAt The instance of the property type. (NullAllowed)
     */
    void setCreatedAt(java.time.LocalDateTime createdAt);

    /**
     * Get the value of createdBy.
     * @return The instance of the property type. (NullAllowed)
     */
    String getCreatedBy();

    /**
     * Set the value of createdBy.
     * @param createdBy The instance of the property type. (NullAllowed)
     */
    void setCreatedBy(String createdBy);

    /**
     * Get the value of updatedAt.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getUpdatedAt();

    /**
     * Set the value of updatedAt.
     * @param updatedAt The instance of the property type. (NullAllowed)
     */
    void setUpdatedAt(java.time.LocalDateTime updatedAt);

    /**
     * Get the value of updatedBy.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdatedBy();

    /**
     * Set the value of updatedBy.
     * @param updatedBy The instance of the property type. (NullAllowed)
     */
    void setUpdatedBy(String updatedBy);
}
