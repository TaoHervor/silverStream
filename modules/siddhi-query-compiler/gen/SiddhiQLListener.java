// Generated from D:/dev/siddhi/modules/siddhi-query-compiler/src/main/antlr4/io/siddhi/query/compiler\SiddhiQL.g4 by ANTLR 4.8

	//import io.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SiddhiQLParser}.
 */
public interface SiddhiQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SiddhiQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SiddhiQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SiddhiQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SiddhiQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#siddhi_app}.
	 * @param ctx the parse tree
	 */
	void enterSiddhi_app(SiddhiQLParser.Siddhi_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#siddhi_app}.
	 * @param ctx the parse tree
	 */
	void exitSiddhi_app(SiddhiQLParser.Siddhi_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void enterExecution_element(SiddhiQLParser.Execution_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void exitExecution_element(SiddhiQLParser.Execution_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream_final(SiddhiQLParser.Definition_stream_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream_final(SiddhiQLParser.Definition_stream_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream(SiddhiQLParser.Definition_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream(SiddhiQLParser.Definition_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table_final(SiddhiQLParser.Definition_table_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table_final(SiddhiQLParser.Definition_table_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table(SiddhiQLParser.Definition_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table(SiddhiQLParser.Definition_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window_final(SiddhiQLParser.Definition_window_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window_final(SiddhiQLParser.Definition_window_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window(SiddhiQLParser.Definition_windowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window(SiddhiQLParser.Definition_windowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_query_final}.
	 * @param ctx the parse tree
	 */
	void enterStore_query_final(SiddhiQLParser.Store_query_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_query_final}.
	 * @param ctx the parse tree
	 */
	void exitStore_query_final(SiddhiQLParser.Store_query_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_query}.
	 * @param ctx the parse tree
	 */
	void enterStore_query(SiddhiQLParser.Store_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_query}.
	 * @param ctx the parse tree
	 */
	void exitStore_query(SiddhiQLParser.Store_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_input}.
	 * @param ctx the parse tree
	 */
	void enterStore_input(SiddhiQLParser.Store_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_input}.
	 * @param ctx the parse tree
	 */
	void exitStore_input(SiddhiQLParser.Store_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function_final(SiddhiQLParser.Definition_function_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function_final(SiddhiQLParser.Definition_function_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function(SiddhiQLParser.Definition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function(SiddhiQLParser.Definition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SiddhiQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SiddhiQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#language_name}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_name(SiddhiQLParser.Language_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#language_name}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_name(SiddhiQLParser.Language_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SiddhiQLParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SiddhiQLParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger_final(SiddhiQLParser.Definition_trigger_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger_final(SiddhiQLParser.Definition_trigger_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger(SiddhiQLParser.Definition_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger(SiddhiQLParser.Definition_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SiddhiQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SiddhiQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_aggregation_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_aggregation_final(SiddhiQLParser.Definition_aggregation_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_aggregation_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_aggregation_final(SiddhiQLParser.Definition_aggregation_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#definition_aggregation}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_aggregation(SiddhiQLParser.Definition_aggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#definition_aggregation}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_aggregation(SiddhiQLParser.Definition_aggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_name(SiddhiQLParser.Aggregation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_name(SiddhiQLParser.Aggregation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time(SiddhiQLParser.Aggregation_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time(SiddhiQLParser.Aggregation_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time_duration}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time_duration(SiddhiQLParser.Aggregation_time_durationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time_duration}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time_duration(SiddhiQLParser.Aggregation_time_durationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time_range}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time_range(SiddhiQLParser.Aggregation_time_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time_range}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time_range(SiddhiQLParser.Aggregation_time_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#aggregation_time_interval}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_time_interval(SiddhiQLParser.Aggregation_time_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#aggregation_time_interval}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_time_interval(SiddhiQLParser.Aggregation_time_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SiddhiQLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SiddhiQLParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#app_annotation}.
	 * @param ctx the parse tree
	 */
	void enterApp_annotation(SiddhiQLParser.App_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#app_annotation}.
	 * @param ctx the parse tree
	 */
	void exitApp_annotation(SiddhiQLParser.App_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_element(SiddhiQLParser.Annotation_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_element(SiddhiQLParser.Annotation_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(SiddhiQLParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(SiddhiQLParser.PartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void enterPartition_final(SiddhiQLParser.Partition_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void exitPartition_final(SiddhiQLParser.Partition_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void enterPartition_with_stream(SiddhiQLParser.Partition_with_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void exitPartition_with_stream(SiddhiQLParser.Partition_with_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void enterCondition_ranges(SiddhiQLParser.Condition_rangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void exitCondition_ranges(SiddhiQLParser.Condition_rangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void enterCondition_range(SiddhiQLParser.Condition_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void exitCondition_range(SiddhiQLParser.Condition_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_final}.
	 * @param ctx the parse tree
	 */
	void enterQuery_final(SiddhiQLParser.Query_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_final}.
	 * @param ctx the parse tree
	 */
	void exitQuery_final(SiddhiQLParser.Query_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SiddhiQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SiddhiQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_input}.
	 * @param ctx the parse tree
	 */
	void enterQuery_input(SiddhiQLParser.Query_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_input}.
	 * @param ctx the parse tree
	 */
	void exitQuery_input(SiddhiQLParser.Query_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stream(SiddhiQLParser.Standard_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stream(SiddhiQLParser.Standard_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stream(SiddhiQLParser.Join_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stream(SiddhiQLParser.Join_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#join_source}.
	 * @param ctx the parse tree
	 */
	void enterJoin_source(SiddhiQLParser.Join_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#join_source}.
	 * @param ctx the parse tree
	 */
	void exitJoin_source(SiddhiQLParser.Join_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void enterPattern_stream(SiddhiQLParser.Pattern_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void exitPattern_stream(SiddhiQLParser.Pattern_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterEvery_pattern_source_chain(SiddhiQLParser.Every_pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitEvery_pattern_source_chain(SiddhiQLParser.Every_pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source_chain(SiddhiQLParser.Pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source_chain(SiddhiQLParser.Pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#absent_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterAbsent_pattern_source_chain(SiddhiQLParser.Absent_pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#absent_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitAbsent_pattern_source_chain(SiddhiQLParser.Absent_pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#left_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterLeft_absent_pattern_source(SiddhiQLParser.Left_absent_pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#left_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitLeft_absent_pattern_source(SiddhiQLParser.Left_absent_pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#right_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterRight_absent_pattern_source(SiddhiQLParser.Right_absent_pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#right_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitRight_absent_pattern_source(SiddhiQLParser.Right_absent_pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source(SiddhiQLParser.Pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source(SiddhiQLParser.Pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterLogical_stateful_source(SiddhiQLParser.Logical_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitLogical_stateful_source(SiddhiQLParser.Logical_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#logical_absent_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterLogical_absent_stateful_source(SiddhiQLParser.Logical_absent_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#logical_absent_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitLogical_absent_stateful_source(SiddhiQLParser.Logical_absent_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#every_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterEvery_absent_pattern_source(SiddhiQLParser.Every_absent_pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#every_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitEvery_absent_pattern_source(SiddhiQLParser.Every_absent_pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterBasic_absent_pattern_source(SiddhiQLParser.Basic_absent_pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_absent_pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitBasic_absent_pattern_source(SiddhiQLParser.Basic_absent_pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_collection_stateful_source(SiddhiQLParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_collection_stateful_source(SiddhiQLParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stateful_source(SiddhiQLParser.Standard_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stateful_source(SiddhiQLParser.Standard_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source(SiddhiQLParser.Basic_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source(SiddhiQLParser.Basic_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handlers(SiddhiQLParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handlers(SiddhiQLParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handler(SiddhiQLParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handler(SiddhiQLParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void enterSequence_stream(SiddhiQLParser.Sequence_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void exitSequence_stream(SiddhiQLParser.Sequence_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#every_sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterEvery_sequence_source_chain(SiddhiQLParser.Every_sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#every_sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitEvery_sequence_source_chain(SiddhiQLParser.Every_sequence_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#every_absent_sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterEvery_absent_sequence_source_chain(SiddhiQLParser.Every_absent_sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#every_absent_sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitEvery_absent_sequence_source_chain(SiddhiQLParser.Every_absent_sequence_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#absent_sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterAbsent_sequence_source_chain(SiddhiQLParser.Absent_sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#absent_sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitAbsent_sequence_source_chain(SiddhiQLParser.Absent_sequence_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#left_absent_sequence_source}.
	 * @param ctx the parse tree
	 */
	void enterLeft_absent_sequence_source(SiddhiQLParser.Left_absent_sequence_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#left_absent_sequence_source}.
	 * @param ctx the parse tree
	 */
	void exitLeft_absent_sequence_source(SiddhiQLParser.Left_absent_sequence_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#right_absent_sequence_source}.
	 * @param ctx the parse tree
	 */
	void enterRight_absent_sequence_source(SiddhiQLParser.Right_absent_sequence_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#right_absent_sequence_source}.
	 * @param ctx the parse tree
	 */
	void exitRight_absent_sequence_source(SiddhiQLParser.Right_absent_sequence_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source_chain(SiddhiQLParser.Sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source_chain(SiddhiQLParser.Sequence_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source(SiddhiQLParser.Sequence_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source(SiddhiQLParser.Sequence_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_collection_stateful_source(SiddhiQLParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_collection_stateful_source(SiddhiQLParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_stream(SiddhiQLParser.Anonymous_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_stream(SiddhiQLParser.Anonymous_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(SiddhiQLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(SiddhiQLParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void enterStream_function(SiddhiQLParser.Stream_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void exitStream_function(SiddhiQLParser.Stream_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(SiddhiQLParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(SiddhiQLParser.WindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#group_by_query_selection}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_query_selection(SiddhiQLParser.Group_by_query_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#group_by_query_selection}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_query_selection(SiddhiQLParser.Group_by_query_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_section}.
	 * @param ctx the parse tree
	 */
	void enterQuery_section(SiddhiQLParser.Query_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_section}.
	 * @param ctx the parse tree
	 */
	void exitQuery_section(SiddhiQLParser.Query_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#group_by}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by(SiddhiQLParser.Group_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#group_by}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by(SiddhiQLParser.Group_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(SiddhiQLParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(SiddhiQLParser.HavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#order_by}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by(SiddhiQLParser.Order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#order_by}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by(SiddhiQLParser.Order_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#order_by_reference}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_reference(SiddhiQLParser.Order_by_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#order_by_reference}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_reference(SiddhiQLParser.Order_by_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(SiddhiQLParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(SiddhiQLParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(SiddhiQLParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(SiddhiQLParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(SiddhiQLParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(SiddhiQLParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#query_output}.
	 * @param ctx the parse tree
	 */
	void enterQuery_output(SiddhiQLParser.Query_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#query_output}.
	 * @param ctx the parse tree
	 */
	void exitQuery_output(SiddhiQLParser.Query_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#store_query_output}.
	 * @param ctx the parse tree
	 */
	void enterStore_query_output(SiddhiQLParser.Store_query_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#store_query_output}.
	 * @param ctx the parse tree
	 */
	void exitStore_query_output(SiddhiQLParser.Store_query_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(SiddhiQLParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(SiddhiQLParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#set_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSet_assignment(SiddhiQLParser.Set_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#set_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSet_assignment(SiddhiQLParser.Set_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_event_type(SiddhiQLParser.Output_event_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_event_type(SiddhiQLParser.Output_event_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate(SiddhiQLParser.Output_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate(SiddhiQLParser.Output_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate_type(SiddhiQLParser.Output_rate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate_type(SiddhiQLParser.Output_rate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#for_time}.
	 * @param ctx the parse tree
	 */
	void enterFor_time(SiddhiQLParser.For_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#for_time}.
	 * @param ctx the parse tree
	 */
	void exitFor_time(SiddhiQLParser.For_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#within_time}.
	 * @param ctx the parse tree
	 */
	void enterWithin_time(SiddhiQLParser.Within_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#within_time}.
	 * @param ctx the parse tree
	 */
	void exitWithin_time(SiddhiQLParser.Within_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#within_time_range}.
	 * @param ctx the parse tree
	 */
	void enterWithin_time_range(SiddhiQLParser.Within_time_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#within_time_range}.
	 * @param ctx the parse tree
	 */
	void exitWithin_time_range(SiddhiQLParser.Within_time_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#per}.
	 * @param ctx the parse tree
	 */
	void enterPer(SiddhiQLParser.PerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#per}.
	 * @param ctx the parse tree
	 */
	void exitPer(SiddhiQLParser.PerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOutput_attribute(SiddhiQLParser.Output_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOutput_attribute(SiddhiQLParser.Output_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SiddhiQLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SiddhiQLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SiddhiQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SiddhiQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_math_operation(SiddhiQLParser.Multiplication_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_math_operation(SiddhiQLParser.Multiplication_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan_lessthan_math_operation(SiddhiQLParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan_lessthan_math_operation(SiddhiQLParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterBasic_math_operation(SiddhiQLParser.Basic_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitBasic_math_operation(SiddhiQLParser.Basic_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterIn_math_operation(SiddhiQLParser.In_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitIn_math_operation(SiddhiQLParser.In_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAddition_math_operation(SiddhiQLParser.Addition_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAddition_math_operation(SiddhiQLParser.Addition_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd_math_operation(SiddhiQLParser.And_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd_math_operation(SiddhiQLParser.And_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterOr_math_operation(SiddhiQLParser.Or_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitOr_math_operation(SiddhiQLParser.Or_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterEquality_math_operation(SiddhiQLParser.Equality_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitEquality_math_operation(SiddhiQLParser.Equality_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterNot_math_operation(SiddhiQLParser.Not_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitNot_math_operation(SiddhiQLParser.Not_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_operation(SiddhiQLParser.Function_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_operation(SiddhiQLParser.Function_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(SiddhiQLParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(SiddhiQLParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#null_check}.
	 * @param ctx the parse tree
	 */
	void enterNull_check(SiddhiQLParser.Null_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#null_check}.
	 * @param ctx the parse tree
	 */
	void exitNull_check(SiddhiQLParser.Null_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void enterStream_reference(SiddhiQLParser.Stream_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void exitStream_reference(SiddhiQLParser.Stream_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(SiddhiQLParser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(SiddhiQLParser.Attribute_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_index(SiddhiQLParser.Attribute_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_index(SiddhiQLParser.Attribute_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_id(SiddhiQLParser.Function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_id(SiddhiQLParser.Function_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void enterFunction_namespace(SiddhiQLParser.Function_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void exitFunction_namespace(SiddhiQLParser.Function_namespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void enterStream_id(SiddhiQLParser.Stream_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void exitStream_id(SiddhiQLParser.Stream_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#source_id}.
	 * @param ctx the parse tree
	 */
	void enterSource_id(SiddhiQLParser.Source_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#source_id}.
	 * @param ctx the parse tree
	 */
	void exitSource_id(SiddhiQLParser.Source_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SiddhiQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SiddhiQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(SiddhiQLParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(SiddhiQLParser.Property_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(SiddhiQLParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(SiddhiQLParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SiddhiQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SiddhiQLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#property_value}.
	 * @param ctx the parse tree
	 */
	void enterProperty_value(SiddhiQLParser.Property_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#property_value}.
	 * @param ctx the parse tree
	 */
	void exitProperty_value(SiddhiQLParser.Property_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void enterProperty_separator(SiddhiQLParser.Property_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void exitProperty_separator(SiddhiQLParser.Property_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(SiddhiQLParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(SiddhiQLParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(SiddhiQLParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(SiddhiQLParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(SiddhiQLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(SiddhiQLParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SiddhiQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SiddhiQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#collect}.
	 * @param ctx the parse tree
	 */
	void enterCollect(SiddhiQLParser.CollectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#collect}.
	 * @param ctx the parse tree
	 */
	void exitCollect(SiddhiQLParser.CollectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_type(SiddhiQLParser.Attribute_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_type(SiddhiQLParser.Attribute_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SiddhiQLParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SiddhiQLParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(SiddhiQLParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(SiddhiQLParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SiddhiQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SiddhiQLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SiddhiQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SiddhiQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#time_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_value(SiddhiQLParser.Time_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#time_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_value(SiddhiQLParser.Time_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#year_value}.
	 * @param ctx the parse tree
	 */
	void enterYear_value(SiddhiQLParser.Year_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#year_value}.
	 * @param ctx the parse tree
	 */
	void exitYear_value(SiddhiQLParser.Year_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#month_value}.
	 * @param ctx the parse tree
	 */
	void enterMonth_value(SiddhiQLParser.Month_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#month_value}.
	 * @param ctx the parse tree
	 */
	void exitMonth_value(SiddhiQLParser.Month_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#week_value}.
	 * @param ctx the parse tree
	 */
	void enterWeek_value(SiddhiQLParser.Week_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#week_value}.
	 * @param ctx the parse tree
	 */
	void exitWeek_value(SiddhiQLParser.Week_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#day_value}.
	 * @param ctx the parse tree
	 */
	void enterDay_value(SiddhiQLParser.Day_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#day_value}.
	 * @param ctx the parse tree
	 */
	void exitDay_value(SiddhiQLParser.Day_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void enterHour_value(SiddhiQLParser.Hour_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void exitHour_value(SiddhiQLParser.Hour_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void enterMinute_value(SiddhiQLParser.Minute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void exitMinute_value(SiddhiQLParser.Minute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#second_value}.
	 * @param ctx the parse tree
	 */
	void enterSecond_value(SiddhiQLParser.Second_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#second_value}.
	 * @param ctx the parse tree
	 */
	void exitSecond_value(SiddhiQLParser.Second_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void enterMillisecond_value(SiddhiQLParser.Millisecond_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void exitMillisecond_value(SiddhiQLParser.Millisecond_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_double_value(SiddhiQLParser.Signed_double_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_double_value(SiddhiQLParser.Signed_double_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_long_value(SiddhiQLParser.Signed_long_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_long_value(SiddhiQLParser.Signed_long_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_float_value(SiddhiQLParser.Signed_float_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_float_value(SiddhiQLParser.Signed_float_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int_value(SiddhiQLParser.Signed_int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int_value(SiddhiQLParser.Signed_int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(SiddhiQLParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(SiddhiQLParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiQLParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(SiddhiQLParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiQLParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(SiddhiQLParser.String_valueContext ctx);
}