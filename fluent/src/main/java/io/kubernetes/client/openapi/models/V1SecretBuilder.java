/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1SecretBuilder extends V1SecretFluentImpl<V1SecretBuilder>
    implements VisitableBuilder<V1Secret, io.kubernetes.client.openapi.models.V1SecretBuilder> {
  public V1SecretBuilder() {
    this(false);
  }

  public V1SecretBuilder(Boolean validationEnabled) {
    this(new V1Secret(), validationEnabled);
  }

  public V1SecretBuilder(V1SecretFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SecretBuilder(
      io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Secret(), validationEnabled);
  }

  public V1SecretBuilder(
      io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Secret instance) {
    this(fluent, instance, false);
  }

  public V1SecretBuilder(
      io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Secret instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withData(instance.getData());

    fluent.withImmutable(instance.getImmutable());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withStringData(instance.getStringData());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1Secret instance) {
    this(instance, false);
  }

  public V1SecretBuilder(
      io.kubernetes.client.openapi.models.V1Secret instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withStringData(instance.getStringData());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Secret build() {
    V1Secret buildable = new V1Secret();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setStringData(fluent.getStringData());
    buildable.setType(fluent.getType());
    return buildable;
  }
}