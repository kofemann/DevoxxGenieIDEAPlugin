package com.devoxx.genie.service;

import com.devoxx.genie.model.Constant;
import com.devoxx.genie.ui.util.DoubleConverter;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.Service;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import com.intellij.util.xmlb.annotations.OptionTag;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Service
@State(
    name = "com.devoxx.genie.ui.SettingsState",
    storages = @Storage("DevoxxGenieSettingsPlugin.xml")
)
public final class SettingsStateService implements PersistentStateComponent<SettingsStateService> {

    public static SettingsStateService getInstance() {
        return ApplicationManager.getApplication().getService(SettingsStateService.class);
    }

    // Local LLM URL fields
    private String ollamaModelUrl = Constant.OLLAMA_MODEL_URL;
    private String lmstudioModelUrl = Constant.LMSTUDIO_MODEL_URL;
    private String gpt4allModelUrl = Constant.GPT4ALL_MODEL_URL;
    private String janModelUrl = Constant.JAN_MODEL_URL;

    // LLM API Keys
    private String openAIKey = "";
    private String mistralKey = "";
    private String anthropicKey = "";
    private String groqKey = "";
    private String fireworksKey = "";
    private String deepInfraKey = "";
    private String geminiKey = "";

    // Prompt fields
    private String testPrompt = Constant.TEST_PROMPT;
    private String reviewPrompt = Constant.REVIEW_PROMPT;
    private String explainPrompt = Constant.EXPLAIN_PROMPT;
    private String customPrompt = Constant.CUSTOM_PROMPT;

    // LLM settings
    @OptionTag(converter = DoubleConverter.class)
    private Double temperature = Constant.TEMPERATURE;

    @OptionTag(converter = DoubleConverter.class)
    private Double topP = Constant.TOP_P;

    private Integer timeout = Constant.TIMEOUT;
    private Integer maxRetries = Constant.MAX_RETRIES;
    private Integer chatMemorySize = Constant.MAX_MEMORY;

    // Was unable to make it work with Integer for some unknown reason
    private String maxOutputTokens = Constant.MAX_OUTPUT_TOKENS.toString();

    // Last selected LLM provider and model name
    private String lastSelectedProvider;
    private String lastSelectedModel;

    // Enable stream mode
    private Boolean streamMode = Constant.STREAM_MODE;

    // Enable AST mode
    private Boolean astMode = Constant.AST_MODE;
    private Boolean astParentClass = Constant.AST_PARENT_CLASS;
    private Boolean astClassReference = Constant.AST_CLASS_REFERENCE;
    private Boolean astFieldReference = Constant.AST_FIELD_REFERENCE;

    @Override
    public SettingsStateService getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull SettingsStateService state) {
        XmlSerializerUtil.copyBean(state, this);
    }
}