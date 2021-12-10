/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.PercentilesBucketAggregation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/pipeline.ts#L203-L205">API
 *      specification</a>
 */
@JsonpDeserializable
public class PercentilesBucketAggregation extends PipelineAggregationBase implements AggregationVariant {
	private final List<Double> percents;

	// ---------------------------------------------------------------------------------------------

	private PercentilesBucketAggregation(Builder builder) {
		super(builder);

		this.percents = ApiTypeHelper.unmodifiable(builder.percents);

	}

	public static PercentilesBucketAggregation of(Function<Builder, ObjectBuilder<PercentilesBucketAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.PercentilesBucket;
	}

	/**
	 * API name: {@code percents}
	 */
	public final List<Double> percents() {
		return this.percents;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.percents)) {
			generator.writeKey("percents");
			generator.writeStartArray();
			for (Double item0 : this.percents) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercentilesBucketAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PercentilesBucketAggregation> {
		@Nullable
		private List<Double> percents;

		/**
		 * API name: {@code percents}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>percents</code>.
		 */
		public final Builder percents(List<Double> list) {
			this.percents = _listAddAll(this.percents, list);
			return this;
		}

		/**
		 * API name: {@code percents}
		 * <p>
		 * Adds one or more values to <code>percents</code>.
		 */
		public final Builder percents(Double value, Double... values) {
			this.percents = _listAdd(this.percents, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercentilesBucketAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercentilesBucketAggregation build() {
			_checkSingleUse();

			return new PercentilesBucketAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercentilesBucketAggregation}
	 */
	public static final JsonpDeserializer<PercentilesBucketAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PercentilesBucketAggregation::setupPercentilesBucketAggregationDeserializer);

	protected static void setupPercentilesBucketAggregationDeserializer(
			ObjectDeserializer<PercentilesBucketAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::percents, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"percents");

	}

}