// @java.file.header

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.apache.ignite.idea.intention;

/**
 * Intention action for generating GridGain-style setter.
 *
 * @author @java.author
 * @version @java.version
 */
public class GridSetterGenerator extends GridGetterSetterGenerator {
    /**
     * Default constructor.
     */
    public GridSetterGenerator() {
        super(false, true);
    }
}
