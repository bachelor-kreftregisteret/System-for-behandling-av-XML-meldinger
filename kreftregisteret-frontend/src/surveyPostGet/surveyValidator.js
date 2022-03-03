export function dateValidator(options) {
    const currentDate = new Date();
    const inputDate = new Date(options.value);
    if (inputDate.getTime() >= currentDate.getTime()) {
        let errorMelding = "Dato kan ikke være etter dagens dato";
        // options.question.addError(errorMelding);
        options.errors = errorMelding;
    }
}
