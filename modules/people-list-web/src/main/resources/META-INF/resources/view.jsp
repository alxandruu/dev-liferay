<%@ include file="/init.jsp" %>

<portlet:actionURL name="<%= PeopleWebMVCPortletKeys.COMMAND_ACTION_ADD_LOAN %>" var="addLoanURL" />
<portlet:resourceURL id="<%= PeopleWebMVCPortletKeys.COMMAND_RESOURCE_AJAX_LOANS %>" var="ajaxLoansURL" />

<div class="m-2 p-2 border rounded">
    <form action="<%= addLoanURL %>" method="post" enctype="multipart/form-data">
        <div class="d-flex justify-content-around">
            <div class="m-1">
                <h4 class="text-center mb-1">Nombre</h4>
                <div><input type="text" class="form-control" name="<portlet:namespace/>name"></div>
            </div>
            <div class="m-1">
                <h4 class="text-center mb-1">Apellidos</h4>
                <div><input type="text" class="form-control" name="<portlet:namespace/>surname"></div>
            </div>
            <div class="m-1">
                <h4 class="text-center mb-1">Fecha de Nacimiento</h4>
                <div><input type="date" class="form-control" name="<portlet:namespace/>birthDate"></div>
            </div>
            <div class="m-1">
                <h4 class="text-center mb-1">Deuda Total</h4>
                <div><input type="number" class="form-control" name="<portlet:namespace/>totalLoan" step="any"></div>
            </div>
        </div>
        <div class="d-flex justify-content-center"><input type="submit" value="Agregar"
                class="btn btn-primary px-2 py-1 mt-4"></div>
    </form>

    <div class="mt-2 pt-2 border-top">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellidos</th>
                    <th scope="col">Fech. Nacimiento</th>
                    <th scope="col">Deuda Total</th>
                </tr>
            </thead>
            <tbody id="people-loans">
            </tbody>
        </table>
    </div>

</div>

<script>
    $(document).ready(function() {
        getAllLoans();
   });

    function doAjax(url, type, dataType, params, callbackFn) {
        jQuery.ajax({
            url: url,
            type: type,
            dataType: dataType,
            data: params,
            cache: false,
            beforeSend: function (jqXHR, settings) {
                //  loading()
            },
            success: function (data) {
                if (callbackFn != undefined && callbackFn != null && callbackFn != "") {
                    callbackFn(data);
                } else {
                    console.log(data)
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.error("doAjax error!" + url);
            },
            complete: function (jqXHR, textStatus) {
                // loading();
            }
        });
    }

    function getAllLoans() {
        let url = '<%= ajaxLoansURL %>';
        let type = 'post';
        let dataType = 'json';
        let params = {};
        let callbackFn = printLoans;

        doAjax(url, type, dataType, params, callbackFn);
    }

    function printLoans(data) {
        $("tbody#people-loans").empty();
        let output = "";
        $.each(data, function (i, val) {
                output += "<tr id='p" + val.peopleId + "'>";
                output += "<th  scope='row'>" + val.peopleId + "</th>";
                output += "<td>" + val.name + "</td>";
                output += "<td>" + val.surname + "</td>";
                output += "<td>" + val.birth + "</td>";
                output += "<td>" + val.total_loan + "</td>";
                output += "</tr></a>";
        });
        $("tbody#people-loans").html(output);
    }



</script>