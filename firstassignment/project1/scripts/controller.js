//
var Controller = (function() {
	var addButtonClickEvent = function(textTrigger, event) {
		var model = this;
		var value = textTrigger.value.trim();
		if(value.length) {
			if(model.notDuplicate(value)) {
				model.Add(value);
				textTrigger.value = null;
			} else {
				alert("Duplicate Value");
			}
		};
	};
	var deleteButtonClickEvent = function(event) {
		var model = this;
		if(event.target.type == "button") {
			model.Delete(event.target.value);
		}
	}
	var constructor = function() {
		var scopeEl;
		var model;
		var view;
		this.init = function(el, m, v) {
			scopeEl = el;
			model = m;
			view = v;
			model.setScope(el);
			model.setView(view);
			model.registerWidget(view.listView());
			model.registerWidget(view.summaryView());
			model.refreshWidgets(view, model);
			var addButton = view.triggerField().getButtonInstance(el);
			var textTrigger = view.triggerField().getTextInstance(el);
			addButton.addEventListener("click", addButtonClickEvent.bind(model, textTrigger));
			// Code to add a event listener for the enter key
			textTrigger.addEventListener("keyup", function(event){
				if(event.keyCode === 13){
					addButton.click();
					textTrigger.focus();
				}
			});
			var listViewEl = scopeEl.getElementsByClassName('listWrapper')[0];
			listViewEl.addEventListener("click", deleteButtonClickEvent.bind(model));
		};
	};
	return new constructor();
});
