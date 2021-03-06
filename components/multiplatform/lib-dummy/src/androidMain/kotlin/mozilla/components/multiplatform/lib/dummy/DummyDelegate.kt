/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.multiplatform.lib.dummy

/**
 * Android-specific [DummyDelegate] implementation.
 */
actual class DummyDelegate {
    /**
     * Returns an Android-specific dummy value.
     */
    actual fun getValue(): String {
        return "Android"
    }
}
