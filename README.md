## Devoxx Genie 

<img height="128" src="src/main/resources/icons/pluginIcon.svg" width="128"/>

[![X](https://img.shields.io/twitter/follow/DevoxxGenie)](https://x.com/devoxxgenie)

Devoxx Genie is a fully Java-based LLM Code Assistant plugin for IntelliJ IDEA, designed to integrate with local LLM providers such as [Ollama](https://ollama.com/), [LMStudio](https://lmstudio.ai/), [GPT4All](https://gpt4all.io/index.html) and [Jan](https://jan.ai) but also cloud based LLM's such as [OpenAI](https://openai.com), [Anthropic](https://www.anthropic.com/), [Mistral](https://mistral.ai/), [Groq](https://groq.com/), [Gemini](https://aistudio.google.com/app/apikey) and [DeepInfra](https://deepinfra.com/dash/deployments).

We now also support LLM-driven web search with [Google](https://developers.google.com/custom-search) and [Tavily](https://tavily.com/).

With Claude 3.5 Sonnet, DevoxxGenie isn't just another developer tool... it's a glimpse into the future of software engineering. As we eagerly await Claude 3.5 Opus, one thing is clear: we're witnessing a paradigm shift in Ai Augmented Programming (AAP) 🐒

[<img width="200" alt="Marketplace" src="https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/1c24d692-37ea-445d-8015-2c25f63e2f90">](https://plugins.jetbrains.com/plugin/24169-devoxxgenie)

https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/a4a4b095-63ab-41cd-add9-c0bca852c21c

### Key Features:

- **🧠 Project Scanner**: Add source code (full project or by package) to prompt context when using Anthropic, OpenAI or Gemini.
- **💰 Token Cost Calculator**: Calculate the cost when using Cloud LLM providers.
- **🔍 Web Search** : Search the web for a given query using Google or Tavily.
- **🏎️ Streaming responses**: See each token as it's received from the LLM in real-time.
- **🧐 Abstract Syntax Tree (AST) context**: Automatically include parent class and class/field references in the prompt for better code analysis.
- **💬 Chat Memory Size**: Set the size of your chat memory, by default its set to a total of 10 messages (system + user & AI msgs).
- **☕️ 100% Java**: An IDEA plugin using local and cloud based LLM models. Fully developed in Java using [Langchain4J](https://github.com/langchain4j/langchain4j)
- **👀 Code Highlighting**: Supports highlighting of code blocks.
- **💬 Chat conversations**: Supports chat conversations with configurable memory size.
- **📁 Add files & code snippets to context**: You can add open files to the chat window context for producing better answers or code snippets if you want to have a super focused window

See new features in action @ [https://www.youtube.com/watch?v=7IJrKIS1eN8 ](https://www.youtube.com/watch?v=E9PcKBSMv8U)

![GenieExample](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/5064cef3-e7f8-4ab8-9485-2dbd0a7788df)

We now support also streaming responses which you can enable in the Settings page 🤩 🚀

https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/8081d4f2-c5c4-4283-af1d-19061b7ae7bf
 
### LLM Settings
In the IDEA settings you can modify the REST endpoints and the LLM parameters.  Make sure to press enter and apply to save your changes.

We now also support Cloud based LLMs, you can paste the API keys on the Settings page. 

<img width="1196" alt="DevoxxGenieSettings" src="https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/266780ce-e640-4815-b6fc-7b2a3f86292a">

### Smart Model Selection and Cost Estimation
The language model dropdown is not just a list anymore, it's your compass for smart model selection.

![Models](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/1924a967-37c3-400c-bac4-fc1a678aeec5)

See available context window sizes for each cloud model
View associated costs upfront
Make data-driven decisions on which model to use for your project

### Add Project to prompt & clipboard

You can now add the full project to your prompt IF your selected cloud LLM has a big enough window context.

![AddFull](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/be014cf1-ee01-428a-bd75-55acc82627fb)

### Calc Cost

Leverage the prompt cost calculator for precise budget management. Get real-time updates on how much of the context window you're using.

![AddCalcProject](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/0c971331-40fe-47a4-8ede-f349fa40c00c)

See the input/output costs and window context per Cloud LLM.  Eventually we'll also allow you to edit these values.

![Cost](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/422fc829-fc9f-42f4-a8e5-c33ec5a239fc)

### Handling Massive Projects?
"But wait," you might say, "my project is HUGE!" 😅 

Fear not! We've got options:

1. Leverage Gemini's Massive Context: 

Gemini's colossal 1 million token window isn't just big, it's massive. We're talking about the capacity to digest approximately 30,000 lines of code in a single go. That's enough to digest most codebases whole, from the tiniest scripts to some decent projects.

But if that's not enough you have more options...

2. Smart Filtering: 

The new "Copy Project" panel lets you: 

Exclude specific directories 
Filter by file extensions
Remove JavaDocs to slim down your context

![Filter](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/9dd782db-5f2a-4397-90d9-21cfefac753c)

3. Selective Inclusion 

Right-click to add only the most relevant parts of your project to the context.

![RightClick](https://github.com/devoxx/DevoxxGenieIDEAPlugin/assets/179457/a86c311a-4589-41f9-bb4a-c8c4f0b884ee)


## The Power of Full Context: A Real-World Example
The DevoxxGenie project itself, at about 70K tokens, fits comfortably within most high-end LLM context windows. 
This allows for incredibly nuanced interactions – we're talking advanced queries and feature requests that leave tools like GitHub Copilot scratching their virtual heads!

### Installation:

- **From IntelliJ IDEA**: Go to `Settings` -> `Plugins` -> `Marketplace` -> Enter 'Devoxx' to find [plugin](https://plugins.jetbrains.com/plugin/24169-devoxxgenie) OR Install plugin from Disk
- **From Source Code**: Clone the repository, build the plugin using `./gradlew buildPlugin`, and install the plugin from the `build/distributions` directory and select file 'DevoxxGenie-X.Y.Z.zip'

### Requirements:

- **IntelliJ** minimum version is 2023.3.4
- **Java** minimum version is JDK 17

### Build

Gradle IntelliJ Plugin prepares a ZIP archive when running the buildPlugin task.  
You'll find it in the build/distributions/ directory

```shell
./gradlew buildPlugin 
```

### Publish plugin

It is recommended to use the publishPlugin task for releasing the plugin

```shell
./gradlew publishPlugin
```


### Usage:
1) Select an LLM provider from the DevoxxGenie panel (right corner)
2) Select some code 
4) Enter shortcode command review, explain, generate unit tests of the selected code or enter a custom prompt.

Enjoy! 
