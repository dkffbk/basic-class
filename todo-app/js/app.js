const text = document.querySelector("#taskInput");
const btn = document.querySelector("#addTask");
const list = document.querySelector("#list");

text.focus();

btn.onclick = addTask;

function addTask() {
  let temp = text.value.trim();

  if (temp == "") {
    alert("Enter a valid task");
    text.focus();
    return;
  }

  let li = document.createElement("li");

  li.innerHTML = `<span>${temp}</span>
  <button onclick="updateTask(this)">update</button>
  <button onclick="deleteTask(this)" >delete</button>`;

  list.appendChild(li);
}

function updateTask(obj) {
  let li = obj.parentElement;
  let temp = li.querySelector("span");
  temp.innerHTML = prompt("Edit Here");
}

function deleteTask(obj) {
  let temp = obj.parentElement;
  list.removeChild(temp);
}
