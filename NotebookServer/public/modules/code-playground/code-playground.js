// Import the LitElement base class and html helper function
import { LitElement, html } from '../../node_modules/lit-element/lit-element.js';
import '../../node_modules/@material/mwc-button/mwc-button.js'

// Extend the LitElement base class
class CodePlayground extends LitElement {

    /**
     * Implement `render` to define a template for your element.
     *
     * You must provide an implementation of `render` for any element
     * that uses LitElement as a base class.
     */
    render(){
        /**
         * `render` must return a lit-html `TemplateResult`.
         *
         * To create a `TemplateResult`, tag a JavaScript template literal
         * with the `html` helper function:
         */
        return html`
            <link rel="stylesheet" href="assets/codemirror/lib/codemirror.css">
            <link rel="stylesheet" href="assets/modules/code-playground/code-playground.css">
            
            <!-- template content -->
            <textarea id="code"></textarea>
            <mwc-button>Run This Code</mwc-button>
    `;
    }

    firstUpdated(changedProperties) {
        let codeTextArea = this.shadowRoot.getElementById("code");

        CodeMirror.fromTextArea(codeTextArea);
    }


}
// Register the new element with the browser.
customElements.define('code-playground', CodePlayground);
