/*
 * PowerNukkit JUnit 5 Testing Framework
 * Copyright (C) 2020  José Roberto de Araújo Júnior
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.powernukkit.tests.mocks;

import org.apiguardian.api.API;
import org.mockito.internal.configuration.injection.MockInjection;

import java.lang.reflect.Field;
import java.util.Set;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

/**
 * @author joserobjr
 */
@API(status = EXPERIMENTAL, since = "0.1.0")
class MockUtil {
    private MockUtil(){ throw new UnsupportedOperationException(); }

    @API(status = EXPERIMENTAL, since = "0.1.0")
    public static void injectMocks(Field needingInjection, Set<Object> mocks, Object testClassInstance) {
        MockInjection.onField(needingInjection, testClassInstance)
                .withMocks(mocks)
                .tryConstructorInjection()
                .tryPropertyOrFieldInjection()
                .handleSpyAnnotation()
                .apply();
    }

    @API(status = EXPERIMENTAL, since = "0.1.0")
    public static void injectMocks(Set<Field> needingInjection, Set<Object> mocks, Object testClassInstance) {
        MockInjection.onFields(needingInjection, testClassInstance)
                .withMocks(mocks)
                .tryConstructorInjection()
                .tryPropertyOrFieldInjection()
                .handleSpyAnnotation()
                .apply();
    }
}
