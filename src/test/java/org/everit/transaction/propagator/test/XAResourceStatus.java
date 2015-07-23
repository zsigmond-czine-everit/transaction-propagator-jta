/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.transaction.propagator.test;

import javax.transaction.Status;

/**
 * Extending javax.persistence.Status interface which contains the start and end status.
 */
public final class XAResourceStatus implements Status {

  /**
   * The transaction is assigned resource and ended without any actions.
   */
  public static final int STATUS_END = 14;

  /**
   * The transaction is assigned resource and started.
   */
  public static final int STATUS_START = 10;

  private XAResourceStatus() {
  }
}
