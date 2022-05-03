import * as SurveyReact from "survey-react";
import Select from 'react-select';
// https://surveyjs.io/Examples/Library?id=custom-widget-react-select#content-js
// Set up a custom component that will render React Select
export class ReactSelect extends SurveyReact.SurveyQuestionDropdown {

    // Convert the `visibleChoices` array to a format supported by React Select
    get options() {
        return this
            .question
            .visibleChoices
            .map((c) => {
                return {value: c.value, label: c.text}
            });
    }

    // Retrieve an option object based on the question value
    get selectedOption() {
        return this
            .options
            .filter((o) => o.value === this.question.value);
    }

    // Set the question value to the selected option value
    onSelectChange = (selectedOption) => {
        this.setValueCore(selectedOption.value);
    }



    renderElement() {
        // If the question is non-editable, render a stylized div
        if (this.isDisplayMode) {
            return (<div
                id={this.question.inputId}
                className={this.question.getControlClass()}
                disabled="disabled"
            >
                {(this.question.displayValue || this.question.optionsCaption)}
            </div>);
        }

        // Otherwise, render the React Select component
        return (<Select id={this.question.inputId}
                        value={this.selectedOption}
                        onChange={this.onSelectChange}
                        options={this.options}
                        required={this.question.isRequired}
                        theme={(theme) => ({
                            ...theme,
                            borderRadius: 0,
                            colors: {
                                ...theme.colors,
                                primary: '#21314d',
                            },
                        })}
                        styles={{
                            control: (base) => ({
                                ...base,
                                minHeight: "25px",
                                maxHeight: "30px",
                                borderColor: "#e7e7e7",
                            }),
                            valueContainer: (base) => ({
                                ...base,
                                minHeight: "30px",
                                maxHeight: "30px",
                                padding: "2px 8px",
                                alignItems: "center",
                                alignContent: "center",

                            }),
                            singleValue: (base) => ({
                                ...base,
                                maxHeight: "30px",
                            }),
                            input: (base) => ({
                                ...base,
                                marginTop: "2px",
                                maxHeight: "30px",
                            }),
                            indicatorsContainer: (base) => ({
                                ...base,
                                maxHeight: "30px"
                            }),
                            option: (base) => ({
                                ...base,
                                fontSize: "14px"
                            })

                        }}
                        placeholder={"Velg..."}
                        menuPortalTarget={document.querySelector('body')}/>);
    }
}


export default ReactSelect;