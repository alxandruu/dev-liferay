<%@ include file="/init.jsp" %>
<portlet:resourceURL id="<%= UserListPortletKeys.COMMAND_RESOURCE_AJAX_GET_USERS %>" var="ajaxUsersURL" />

<div class="live-reloading-form" id="<portlet:namespace/>">
    <div class="section-form-filter" >
        <h2><liferay-ui:message key="users.title.filter" /></h2>
        <div class="row">
            <div class="form-group col-auto">
                <label for="fname"><liferay-ui:message key="users.field.name" /></label>
                <input type="text" class="form-control" name="fname" id="fname" placeholder="">
            </div>
            <div class="form-group col-auto">
                <label for="fsurnames"><liferay-ui:message key="users.field.surnames" /></label>
                <input type="text" class="form-control" name="fsurnames" id="fsurnames" placeholder="">
            </div>
            <div class="form-group col-auto"  >
                <label for="femail"><liferay-ui:message key="users.field.email" /></label>
                <input type="email" class="form-control" name="femail" id="femail" placeholder="" style="min-width: 350px">
            </div>
        </div>

    </div>

	<table class="section-data-table table table-hover">
		<thead>
			<tr>
				<th scope="col"><liferay-ui:message key="users.field.username" /></th>
				<th scope="col"><liferay-ui:message key="users.field.name" /></th>
				<th scope="col"><liferay-ui:message key="users.field.surname1" /></th>
				<th scope="col"><liferay-ui:message key="users.field.surname2" /></th>
				<th scope="col"><liferay-ui:message key="users.field.email" /></th>
			</tr>
		</thead>
		<tbody>
            <!-- async data loading -->
            <!-- TODO: add a loading icon-->
		</tbody>
	</table>
    <nav aria-label="Users Page Navigation" class="mt-2 section-pagination">
        <ul class="pagination flex-nowrap"  style="min-width: 100px; max-width: 300px; overflow-x: auto;">
           <!-- async data loading -->
        </ul>
      </nav>
</div>

<script>

//PA EL TEMA


//ESTO NO
liveReloadingForms.push({
    namespace: '<portlet:namespace/>',
    endpoint: '<%= ajaxUsersURL %>',
    filterParams: {},
    timeoutId: null,
    fn: getUsersWithPagination
})

// Esto pa un theme
document.addEventListener("DOMContentLoaded", () => {
    initLiveForms(liveReloadingForms)
});


// Esto para un archivo en el theme js dedicado a live reloadings
function initLiveForms(arr) {
    arr.forEach(lrform => {
        document.querySelector('.live-reloading-form#'+ lrform.namespace + ' .section-form-filter').querySelectorAll('input').forEach(el => {
            el.addEventListener('keyup', (e) => {
                inputLiveReloadingFn(lrform, e.target)
            })
        })

        lrform.fn()
    })
}

function inputLiveReloadingFn(liveForm, target) {
    liveForm.timeoutId != null && clearTimeout(liveForm.timeoutId)
    // TODO: realizar validaciones de los campos en la parte FRONTEND antes de actualizar el filtro y realizar la peticion. Crear una funcion genérica que
    // según el type del input o un atributo especificado en el input
    const iname = target.name
    const ivalue = target.value
    liveForm.filterParams[iname] = ivalue

    liveForm.timeoutId = setTimeout(() => {
        const params = new FormData();
        params.append(liveForm.namespace + 'page', 1);
        Object.entries(liveForm.filterParams).forEach(([key, value]) => {
            params.append(liveForm.namespace + key, value);
        })
        liveForm.fn(params)
    }, 300)
}



function loadPagesNavigation(liveForm, currentPage, pages) {
    const pagination_element_ul = document.querySelector('.live-reloading-form#'+ liveForm.namespace + ' .section-pagination ul');
    const lipages = []
    for (let i = 1; i <= pages; i++) {
        const li = document.createElement('li')
        li.classList = 'page-item'
        const a = document.createElement('a')
        a.classList = 'page-link'
        a.href = 'javascript:void(0)'
        a.setAttribute('page', i)
        a.innerText = i
        if(i == currentPage) {
           a.classList.add('active')
        } else {
            a.addEventListener('click', (e) => {
            const page = e.target.getAttribute("page")
            const params = new FormData();
            params.append(liveForm.namespace + 'page', page);
            Object.entries(liveForm.filterParams).forEach(([key, value]) => {
                params.append(liveForm.namespace + key, value);
            })
            liveForm.fn(params)

        })
        }
        li.append(a)
        lipages.push(li)
    }
    pagination_element_ul.replaceChildren(...lipages)
}

function emptyListMessage(table) {
    const tr = document.createElement('tr')
    const td = document.createElement('td')
    td.classList= 'text-center'
    td.setAttribute("colspan", table.rows[0].cells.length)
    td.innerText = '<liferay-ui:message key="table.empty" />'
    tr.append(td)
    return tr;
}



function getUsersWithPagination(params = null){
    if(params == null) {
        params = new FormData();
        params.append(this.namespace + 'page', 1);
    }
    fetch(this.endpoint, {
        method: "POST",
        body: params
    })
    .then(response => response.json())
    .then(data => {
        loadLiveFormUsersInTable(this, data.usuarios)
        loadPagesNavigation(this, data.activePage, data.totalPages)
    });
}

function loadLiveFormUsersInTable(liveForm, users) {
   const table = document.querySelector('.live-reloading-form#'+ liveForm.namespace + ' .section-data-table');
   const tbody = table.querySelector('tbody');
   let table_rows = [emptyListMessage(table)]
   if (users.length != 0) {
        table_rows = users.map(value => {
          const tr = document.createElement('tr')
          const tdUsername = document.createElement('td')
          tdUsername.innerText = value.username
          tdUsername.setAttribute("scope", "row")
          const tdName = document.createElement('td')
          tdName.innerText = value.name
          const tdSurname1 = document.createElement('td')
          tdSurname1.innerText = value.surname1
          const tdSurname2 = document.createElement('td')
          tdSurname2.innerText = value.surname2 ?? ''
          const tdEmail = document.createElement('td')
          tdEmail.innerText = value.email

          tr.append(tdUsername)
          tr.append(tdName)
          tr.append(tdSurname1)
          tr.append(tdSurname2)
          tr.append(tdEmail)
          return tr
      })
   }
   tbody.replaceChildren(...table_rows)
}

</script>
